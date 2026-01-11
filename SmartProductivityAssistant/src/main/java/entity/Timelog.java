package entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "timelog")
public class Timelog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timelog_id", nullable = false)
    private Long id;

    @Column(name = "startTime", nullable = false)
    private Date startTime;

    @Column(name = "endTime", nullable = false)
    private Date endTime;

    @Column(name = "estimated_time", nullable = false)
    private BigInteger estimatedTime;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    public Timelog() {}

    public Timelog(Date startTime, Date endTime,
                   BigInteger estimatedTime, Task task) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.estimatedTime = estimatedTime;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigInteger getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(BigInteger estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
