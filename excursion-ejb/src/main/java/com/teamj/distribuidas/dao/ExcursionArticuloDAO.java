/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.teamj.distribuidas.model.ExcursionArticulo;
import java.math.BigDecimal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Gaming
 */
@LocalBean
@Stateless
public class ExcursionArticuloDAO extends DefaultGenericDAOImple<ExcursionArticulo, BigDecimal> {
    public ExcursionArticuloDAO() {
        super(ExcursionArticulo.class);
    }
}
