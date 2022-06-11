import util.HibernateUtil;

import javax.persistence.EntityManager;

public class ToDoApp {
    public static void main(String[] args) {

        EntityManager entityManager = HibernateUtil.getEm();

    }
}
