/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("http://ovc.catastro.meh.es/")
    .addConverterFactory(SimpleXmlConverterFactory.create())
    .build();
    ServicioPideDatos service=retrofit.create(ServicioPideDatos.class);
    Call<consulta_provinciero> datos=service.recuperarDatos();
    datos.enqueue(new Callback<consulta_provinciero>() {
              @Override
              public void onResponse(Call<consulta_provinciero> call, Response<consulta_provinciero> rspns) {
                  consulta_provinciero informacion=rspns.body();
                  System.out.println(informacion);
              }

              @Override
              public void onFailure(Call<consulta_provinciero> call, Throwable thrwbl) {
                  System.out.println("ERROR: "+thrwbl.getLocalizedMessage()+" "+thrwbl.getStackTrace());
              }
    });
    
    }
    }

