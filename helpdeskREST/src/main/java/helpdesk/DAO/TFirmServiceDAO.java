/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpdesk.DAO;

import helpdesk.bean.TFirmService;
import javax.persistence.EntityManager;

/**
 *
 * @author vasil
 */
public class TFirmServiceDAO extends abstractClassDAO<TFirmService, Long>{
    
    public TFirmServiceDAO(EntityManager em) {
        super(em);
    }
    
}
