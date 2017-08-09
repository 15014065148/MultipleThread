package MultipleThread.threads;

/**
 * Created by sai.luo on 2017-8-9.
 */
public class Worker  {
    private Machine machine ;
    private int taskCount ;
    public Worker( Machine machine,int taskCount) {
        this.machine = machine;
        this.taskCount = taskCount ;
    }

    public void workAlone() {
        try {
            machine.workingAlone(taskCount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void workingTogether() {
        try {
            machine.workingTogether();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void synchronizedWork() {
        try {
            machine.synchrozedWorking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void workingByLock() {
        try {
            machine.workingByLock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void synchrozedWorkingByLockObject() {
        try {
            machine.synchrozedWorkingByLockObject();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
