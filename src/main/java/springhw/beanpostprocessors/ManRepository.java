package springhw.beanpostprocessors;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ManRepository {
    private List<Man> records = new LinkedList<>();

    public ManRepository(List<Man> records) {
        this.records = records;
    }

    public List<Man> getRecords() {
        return records;
    }

    public void setRecords(List<Man> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "ManRepository [records=" + records + "]";
    }

}
