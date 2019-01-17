
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OperacionDos", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OperacionDos {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "multiplicacion_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicacion_ws", targetNamespace = "http://ws/", className = "ws.MultiplicacionWs")
    @ResponseWrapper(localName = "multiplicacion_wsResponse", targetNamespace = "http://ws/", className = "ws.MultiplicacionWsResponse")
    @Action(input = "http://ws/OperacionDos/multiplicacion_wsRequest", output = "http://ws/OperacionDos/multiplicacion_wsResponse")
    public float multiplicacionWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "division_modulo_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division_modulo_ws", targetNamespace = "http://ws/", className = "ws.DivisionModuloWs")
    @ResponseWrapper(localName = "division_modulo_wsResponse", targetNamespace = "http://ws/", className = "ws.DivisionModuloWsResponse")
    @Action(input = "http://ws/OperacionDos/division_modulo_wsRequest", output = "http://ws/OperacionDos/division_modulo_wsResponse")
    public float divisionModuloWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "cos_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cos_ws", targetNamespace = "http://ws/", className = "ws.CosWs")
    @ResponseWrapper(localName = "cos_wsResponse", targetNamespace = "http://ws/", className = "ws.CosWsResponse")
    @Action(input = "http://ws/OperacionDos/cos_wsRequest", output = "http://ws/OperacionDos/cos_wsResponse")
    public float cosWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "tan_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tan_ws", targetNamespace = "http://ws/", className = "ws.TanWs")
    @ResponseWrapper(localName = "tan_wsResponse", targetNamespace = "http://ws/", className = "ws.TanWsResponse")
    @Action(input = "http://ws/OperacionDos/tan_wsRequest", output = "http://ws/OperacionDos/tan_wsResponse")
    public float tanWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "suma_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma_ws", targetNamespace = "http://ws/", className = "ws.SumaWs")
    @ResponseWrapper(localName = "suma_wsResponse", targetNamespace = "http://ws/", className = "ws.SumaWsResponse")
    @Action(input = "http://ws/OperacionDos/suma_wsRequest", output = "http://ws/OperacionDos/suma_wsResponse")
    public float sumaWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "division_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division_ws", targetNamespace = "http://ws/", className = "ws.DivisionWs")
    @ResponseWrapper(localName = "division_wsResponse", targetNamespace = "http://ws/", className = "ws.DivisionWsResponse")
    @Action(input = "http://ws/OperacionDos/division_wsRequest", output = "http://ws/OperacionDos/division_wsResponse")
    public float divisionWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "potencia_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "potencia_ws", targetNamespace = "http://ws/", className = "ws.PotenciaWs")
    @ResponseWrapper(localName = "potencia_wsResponse", targetNamespace = "http://ws/", className = "ws.PotenciaWsResponse")
    @Action(input = "http://ws/OperacionDos/potencia_wsRequest", output = "http://ws/OperacionDos/potencia_wsResponse")
    public float potenciaWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "raiz_cubica_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "raiz_cubica_ws", targetNamespace = "http://ws/", className = "ws.RaizCubicaWs")
    @ResponseWrapper(localName = "raiz_cubica_wsResponse", targetNamespace = "http://ws/", className = "ws.RaizCubicaWsResponse")
    @Action(input = "http://ws/OperacionDos/raiz_cubica_wsRequest", output = "http://ws/OperacionDos/raiz_cubica_wsResponse")
    public float raizCubicaWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "raiz_cuadrada_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "raiz_cuadrada_ws", targetNamespace = "http://ws/", className = "ws.RaizCuadradaWs")
    @ResponseWrapper(localName = "raiz_cuadrada_wsResponse", targetNamespace = "http://ws/", className = "ws.RaizCuadradaWsResponse")
    @Action(input = "http://ws/OperacionDos/raiz_cuadrada_wsRequest", output = "http://ws/OperacionDos/raiz_cuadrada_wsResponse")
    public float raizCuadradaWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "resta_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta_ws", targetNamespace = "http://ws/", className = "ws.RestaWs")
    @ResponseWrapper(localName = "resta_wsResponse", targetNamespace = "http://ws/", className = "ws.RestaWsResponse")
    @Action(input = "http://ws/OperacionDos/resta_wsRequest", output = "http://ws/OperacionDos/resta_wsResponse")
    public float restaWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod(operationName = "sin_ws")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sin_ws", targetNamespace = "http://ws/", className = "ws.SinWs")
    @ResponseWrapper(localName = "sin_wsResponse", targetNamespace = "http://ws/", className = "ws.SinWsResponse")
    @Action(input = "http://ws/OperacionDos/sin_wsRequest", output = "http://ws/OperacionDos/sin_wsResponse")
    public float sinWs(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

}