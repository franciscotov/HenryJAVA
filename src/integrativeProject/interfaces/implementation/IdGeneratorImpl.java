package integrativeProject.interfaces.implementation;

import integrativeProject.interfaces.IdGenerator;

public class IdGeneratorImpl implements IdGenerator {
    private Long id = 0L;
    @Override
    public Long generateId() {
        this.id += 1;
        return this.id.longValue();
    }
}
