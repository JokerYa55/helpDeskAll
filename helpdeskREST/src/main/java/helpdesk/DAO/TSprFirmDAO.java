/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TSprFirm;
import helpdesk.interfaces.daoInterface;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
public class TSprFirmDAO implements daoInterface<TSprFirm, Long> {

    final Logger log = Logger.getLogger(getClass().getName());

    private EntityManager em;

    public TSprFirmDAO() {
        this.em = Persistence.createEntityManagerFactory("helpDesk_JPA").createEntityManager();
    }

    @Override
    public EntityManager getEM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
