/*
 * This file is generated by jOOQ.
 */
package model.generated.tables;


import java.util.function.Function;

import model.generated.DefaultSchema;
import model.generated.tables.records.ListeAttesaRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListeAttesa extends TableImpl<ListeAttesaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LISTE_ATTESA</code>
     */
    public static final ListeAttesa LISTE_ATTESA = new ListeAttesa();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListeAttesaRecord> getRecordType() {
        return ListeAttesaRecord.class;
    }

    /**
     * The column <code>LISTE_ATTESA.INTERVENTO</code>.
     */
    public final TableField<ListeAttesaRecord, String> INTERVENTO = createField(DSL.name("INTERVENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>LISTE_ATTESA.TIPO_INTERVENTO</code>.
     */
    public final TableField<ListeAttesaRecord, String> TIPO_INTERVENTO = createField(DSL.name("TIPO_INTERVENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>LISTE_ATTESA.TIPO_LISTA</code>.
     */
    public final TableField<ListeAttesaRecord, String> TIPO_LISTA = createField(DSL.name("TIPO_LISTA"), SQLDataType.CLOB.nullable(false), this, "");

    private ListeAttesa(Name alias, Table<ListeAttesaRecord> aliased) {
        this(alias, aliased, null);
    }

    private ListeAttesa(Name alias, Table<ListeAttesaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>LISTE_ATTESA</code> table reference
     */
    public ListeAttesa(String alias) {
        this(DSL.name(alias), LISTE_ATTESA);
    }

    /**
     * Create an aliased <code>LISTE_ATTESA</code> table reference
     */
    public ListeAttesa(Name alias) {
        this(alias, LISTE_ATTESA);
    }

    /**
     * Create a <code>LISTE_ATTESA</code> table reference
     */
    public ListeAttesa() {
        this(DSL.name("LISTE_ATTESA"), null);
    }

    public <O extends Record> ListeAttesa(Table<O> child, ForeignKey<O, ListeAttesaRecord> key) {
        super(child, key, LISTE_ATTESA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public ListeAttesa as(String alias) {
        return new ListeAttesa(DSL.name(alias), this);
    }

    @Override
    public ListeAttesa as(Name alias) {
        return new ListeAttesa(alias, this);
    }

    @Override
    public ListeAttesa as(Table<?> alias) {
        return new ListeAttesa(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ListeAttesa rename(String name) {
        return new ListeAttesa(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListeAttesa rename(Name name) {
        return new ListeAttesa(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListeAttesa rename(Table<?> name) {
        return new ListeAttesa(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
