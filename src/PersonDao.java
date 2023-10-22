public interface PersonDao {

    Long create(Person person);

    Person findById(Long id);

}