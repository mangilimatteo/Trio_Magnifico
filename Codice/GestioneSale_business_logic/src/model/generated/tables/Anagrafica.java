/*
 * This file is generated by jOOQ.
 */
package model.generated.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import model.generated.DefaultSchema;
import model.generated.Keys;
import model.generated.tables.records.AnagraficaRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Anagrafica extends TableImpl<AnagraficaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ANAGRAFICA</code>
     */
    public static final Anagrafica ANAGRAFICA = new Anagrafica();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AnagraficaRecord> getRecordType() {
        return AnagraficaRecord.class;
    }

    /**
     * The column <code>ANAGRAFICA.CODICE</code>.
     */
    public final TableField<AnagraficaRecord, String> CODICE = createField(DSL.name("CODICE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.NOME</code>.
     */
    public final TableField<AnagraficaRecord, String> NOME = createField(DSL.name("NOME"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.COGNOME</code>.
     */
    public final TableField<AnagraficaRecord, String> COGNOME = createField(DSL.name("COGNOME"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.CODICE_FISCALE</code>.
     */
    public final TableField<AnagraficaRecord, String> CODICE_FISCALE = createField(DSL.name("CODICE_FISCALE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.GIORNO_NASCITA</code>.
     */
    public final TableField<AnagraficaRecord, String> GIORNO_NASCITA = createField(DSL.name("GIORNO_NASCITA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.MESE_NASCITA</code>.
     */
    public final TableField<AnagraficaRecord, String> MESE_NASCITA = createField(DSL.name("MESE_NASCITA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.ANNO_NASCITA</code>.
     */
    public final TableField<AnagraficaRecord, String> ANNO_NASCITA = createField(DSL.name("ANNO_NASCITA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.LUOGO_NASCITA</code>.
     */
    public final TableField<AnagraficaRecord, String> LUOGO_NASCITA = createField(DSL.name("LUOGO_NASCITA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.CITTA</code>.
     */
    public final TableField<AnagraficaRecord, String> CITTA = createField(DSL.name("CITTA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.INDIRIZZO</code>.
     */
    public final TableField<AnagraficaRecord, String> INDIRIZZO = createField(DSL.name("INDIRIZZO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.TELEFONO</code>.
     */
    public final TableField<AnagraficaRecord, String> TELEFONO = createField(DSL.name("TELEFONO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.EMAIL</code>.
     */
    public final TableField<AnagraficaRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.DIAGNOSI</code>.
     */
    public final TableField<AnagraficaRecord, String> DIAGNOSI = createField(DSL.name("DIAGNOSI"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.INTERVENTO</code>.
     */
    public final TableField<AnagraficaRecord, String> INTERVENTO = createField(DSL.name("INTERVENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.ANAMNESI_PREGRESSA</code>.
     */
    public final TableField<AnagraficaRecord, String> ANAMNESI_PREGRESSA = createField(DSL.name("ANAMNESI_PREGRESSA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.ANAMNESI_PROSSIMA</code>.
     */
    public final TableField<AnagraficaRecord, String> ANAMNESI_PROSSIMA = createField(DSL.name("ANAMNESI_PROSSIMA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.TEMPO_ATTESA</code>.
     */
    public final TableField<AnagraficaRecord, String> TEMPO_ATTESA = createField(DSL.name("TEMPO_ATTESA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.MATR_MEDICO</code>.
     */
    public final TableField<AnagraficaRecord, String> MATR_MEDICO = createField(DSL.name("MATR_MEDICO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ANAGRAFICA.NOTE</code>.
     */
    public final TableField<AnagraficaRecord, String> NOTE = createField(DSL.name("NOTE"), SQLDataType.CLOB.nullable(false), this, "");

    private Anagrafica(Name alias, Table<AnagraficaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Anagrafica(Name alias, Table<AnagraficaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ANAGRAFICA</code> table reference
     */
    public Anagrafica(String alias) {
        this(DSL.name(alias), ANAGRAFICA);
    }

    /**
     * Create an aliased <code>ANAGRAFICA</code> table reference
     */
    public Anagrafica(Name alias) {
        this(alias, ANAGRAFICA);
    }

    /**
     * Create a <code>ANAGRAFICA</code> table reference
     */
    public Anagrafica() {
        this(DSL.name("ANAGRAFICA"), null);
    }

    public <O extends Record> Anagrafica(Table<O> child, ForeignKey<O, AnagraficaRecord> key) {
        super(child, key, ANAGRAFICA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<AnagraficaRecord> getPrimaryKey() {
        return Keys.ANAGRAFICA__PK_ANAGRAFICA;
    }

    @Override
    public List<ForeignKey<AnagraficaRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ANAGRAFICA__FK_ANAGRAFICA_PK_DIPENDENTE);
    }

    private transient Dipendente _dipendente;

    /**
     * Get the implicit join path to the <code>DIPENDENTE</code> table.
     */
    public Dipendente dipendente() {
        if (_dipendente == null)
            _dipendente = new Dipendente(this, Keys.ANAGRAFICA__FK_ANAGRAFICA_PK_DIPENDENTE);

        return _dipendente;
    }

    @Override
    public Anagrafica as(String alias) {
        return new Anagrafica(DSL.name(alias), this);
    }

    @Override
    public Anagrafica as(Name alias) {
        return new Anagrafica(alias, this);
    }

    @Override
    public Anagrafica as(Table<?> alias) {
        return new Anagrafica(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Anagrafica rename(String name) {
        return new Anagrafica(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Anagrafica rename(Name name) {
        return new Anagrafica(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Anagrafica rename(Table<?> name) {
        return new Anagrafica(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
