import java.util.Objects;

public class Emp_details {

    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp_details that = (Emp_details) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, code);
    }

    private String name;
    private String code;
}
