package kodlamaio.hrms.busieness.concretes;

import kodlamaio.hrms.busieness.abstracts.JobPositionsService;
import kodlamaio.hrms.dataAccsess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobPositionsManager implements JobPositionsService {


    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
        this.jobPositionsDao = jobPositionsDao;
    }

    @Override
    public List<JobPositions> getAll() {
        return jobPositionsDao.findAll();
    }
}
