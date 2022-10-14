package service.impl;

import service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository studentRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public CommonResponse findById(String id) {
        Optional<Teacher> stu =  teacherRepository.findById(id);
        if(stu.isEmpty()) {
            //log
            throw new ResourceNotFoundException("...");
        }
        return new CommonResponse(0, new Date(), stu.get());
    }

    @Override
    public CommonResponse findAll() {
        List<Teacher> stuList =  TeacherRepository.findAll();
        return new CommonResponse(0, new Date(), stuList);
    }

    @Override
    @Transactional
    public CommonResponse insert(Teacher tea) {
        Teacher teacher = TeacherRepository.insert(tea);
        return new CommonResponse(0, new Date(), student.getId());
    }
}
