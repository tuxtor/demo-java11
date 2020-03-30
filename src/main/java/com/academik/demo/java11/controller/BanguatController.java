package com.academik.demo.java11.controller;


import gt.gob.banguat.variables.ws.InfoVariable;
import gt.gob.banguat.variables.ws.TipoCambio;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigDecimal;

/**
 * Retrieves exchange rate for guatemala
 */
@Path("/banguat")
@Singleton
public class BanguatController {

    @GET
    public String getExtancheRate(){
        var response = new TipoCambio().getTipoCambioSoap().tipoCambioDia();
        var exchangeRate = new BigDecimal(
                response.getCambioDolar().getVarDolar().get(0).getReferencia());

        return exchangeRate.toString();
    }
}
