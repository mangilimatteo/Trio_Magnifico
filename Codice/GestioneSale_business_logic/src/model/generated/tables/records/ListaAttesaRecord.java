/*
 * This file is generated by jOOQ.
 */
package model.generated.tables.records;


import model.generated.tables.ListaAttesa;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListaAttesaRecord extends UpdatableRecordImpl<ListaAttesaRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LISTA_ATTESA.INTERVENTO</code>.
     */
    public void setIntervento(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>LISTA_ATTESA.INTERVENTO</code>.
     */
    public String getIntervento() {
        return (String) get(0);
    }

    /**
     * Setter for <code>LISTA_ATTESA.TIPO_INTERVENTO</code>.
     */
    public void setTipoIntervento(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>LISTA_ATTESA.TIPO_INTERVENTO</code>.
     */
    public String getTipoIntervento() {
        return (String) get(1);
    }

    /**
     * Setter for <code>LISTA_ATTESA.TIPO_LISTA</code>.
     */
    public void setTipoLista(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>LISTA_ATTESA.TIPO_LISTA</code>.
     */
    public String getTipoLista() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ListaAttesa.LISTA_ATTESA.INTERVENTO;
    }

    @Override
    public Field<String> field2() {
        return ListaAttesa.LISTA_ATTESA.TIPO_INTERVENTO;
    }

    @Override
    public Field<String> field3() {
        return ListaAttesa.LISTA_ATTESA.TIPO_LISTA;
    }

    @Override
    public String component1() {
        return getIntervento();
    }

    @Override
    public String component2() {
        return getTipoIntervento();
    }

    @Override
    public String component3() {
        return getTipoLista();
    }

    @Override
    public String value1() {
        return getIntervento();
    }

    @Override
    public String value2() {
        return getTipoIntervento();
    }

    @Override
    public String value3() {
        return getTipoLista();
    }

    @Override
    public ListaAttesaRecord value1(String value) {
        setIntervento(value);
        return this;
    }

    @Override
    public ListaAttesaRecord value2(String value) {
        setTipoIntervento(value);
        return this;
    }

    @Override
    public ListaAttesaRecord value3(String value) {
        setTipoLista(value);
        return this;
    }

    @Override
    public ListaAttesaRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ListaAttesaRecord
     */
    public ListaAttesaRecord() {
        super(ListaAttesa.LISTA_ATTESA);
    }

    /**
     * Create a detached, initialised ListaAttesaRecord
     */
    public ListaAttesaRecord(String intervento, String tipoIntervento, String tipoLista) {
        super(ListaAttesa.LISTA_ATTESA);

        setIntervento(intervento);
        setTipoIntervento(tipoIntervento);
        setTipoLista(tipoLista);
        resetChangedOnNotNull();
    }
}
