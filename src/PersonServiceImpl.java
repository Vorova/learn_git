public class PersonServiceImpl implements PersonService {

    private PersonDao personDao = new PersonDaoImpl();

    public Long create(Person person) {
        return personDao.create(person);
    }

}