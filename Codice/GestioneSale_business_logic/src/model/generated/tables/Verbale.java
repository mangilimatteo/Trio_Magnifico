/*
 * This file is generated by jOOQ.
 */
package model.generated.tables;


import java.util.Arrays;
import java.util.List;

import model.generated.DefaultSchema;
import model.generated.Keys;
import model.generated.tables.records.VerbaleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class Verbale extends TableImpl<VerbaleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>VERBALE</code>
     */
    public static final Verbale VERBALE = new Verbale();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VerbaleRecord> getRecordType() {
        return VerbaleRecord.class;
    }

    /**
     * The column <code>VERBALE.CODICE</code>.
     */
    public final TableField<VerbaleRecord, String> CODICE = createField(DSL.name("CODICE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.INGRESSO_BLOCCO</code>.
     */
    public final TableField<VerbaleRecord, String> INGRESSO_BLOCCO = createField(DSL.name("INGRESSO_BLOCCO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.INGRESSO_SALA</code>.
     */
    public final TableField<VerbaleRecord, String> INGRESSO_SALA = createField(DSL.name("INGRESSO_SALA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.POSIZIONAMENTO</code>.
     */
    public final TableField<VerbaleRecord, String> POSIZIONAMENTO = createField(DSL.name("POSIZIONAMENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.INIZIO_ANESTESIA</code>.
     */
    public final TableField<VerbaleRecord, String> INIZIO_ANESTESIA = createField(DSL.name("INIZIO_ANESTESIA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.FINE_ANESTESIA</code>.
     */
    public final TableField<VerbaleRecord, String> FINE_ANESTESIA = createField(DSL.name("FINE_ANESTESIA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.INIZIO_INTERVENTO</code>.
     */
    public final TableField<VerbaleRecord, String> INIZIO_INTERVENTO = createField(DSL.name("INIZIO_INTERVENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.FINE_INTERVENTO</code>.
     */
    public final TableField<VerbaleRecord, String> FINE_INTERVENTO = createField(DSL.name("FINE_INTERVENTO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.RISVEGLIO</code>.
     */
    public final TableField<VerbaleRecord, String> RISVEGLIO = createField(DSL.name("RISVEGLIO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.USCITA_SALA</code>.
     */
    public final TableField<VerbaleRecord, String> USCITA_SALA = createField(DSL.name("USCITA_SALA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.USCITA_BLOCCO</code>.
     */
    public final TableField<VerbaleRecord, String> USCITA_BLOCCO = createField(DSL.name("USCITA_BLOCCO"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.TIPO_ANESTESIA</code>.
     */
    public final TableField<VerbaleRecord, String> TIPO_ANESTESIA = createField(DSL.name("TIPO_ANESTESIA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.RISCHIO_ANESTESIA</code>.
     */
    public final TableField<VerbaleRecord, String> RISCHIO_ANESTESIA = createField(DSL.name("RISCHIO_ANESTESIA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.PRIMO_OPERATORE</code>.
     */
    public final TableField<VerbaleRecord, String> PRIMO_OPERATORE = createField(DSL.name("PRIMO_OPERATORE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.SECONDO_OPERATORE</code>.
     */
    public final TableField<VerbaleRecord, String> SECONDO_OPERATORE = createField(DSL.name("SECONDO_OPERATORE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.TERZO_OPERATORE</code>.
     */
    public final TableField<VerbaleRecord, String> TERZO_OPERATORE = createField(DSL.name("TERZO_OPERATORE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.ANESTESISTA</code>.
     */
    public final TableField<VerbaleRecord, String> ANESTESISTA = createField(DSL.name("ANESTESISTA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.STRUMENTISTA</code>.
     */
    public final TableField<VerbaleRecord, String> STRUMENTISTA = createField(DSL.name("STRUMENTISTA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.INFERMIERE</code>.
     */
    public final TableField<VerbaleRecord, String> INFERMIERE = createField(DSL.name("INFERMIERE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.AIUTO_ANESTESISTA</code>.
     */
    public final TableField<VerbaleRecord, String> AIUTO_ANESTESISTA = createField(DSL.name("AIUTO_ANESTESISTA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.TECNICO_RADIOLOGIA</code>.
     */
    public final TableField<VerbaleRecord, String> TECNICO_RADIOLOGIA = createField(DSL.name("TECNICO_RADIOLOGIA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.PROCEDURA</code>.
     */
    public final TableField<VerbaleRecord, String> PROCEDURA = createField(DSL.name("PROCEDURA"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>VERBALE.CODICE_OPERAZIONE</code>.
     */
    public final TableField<VerbaleRecord, String> CODICE_OPERAZIONE = createField(DSL.name("CODICE_OPERAZIONE"), SQLDataType.CLOB.nullable(false), this, "");

    private Verbale(Name alias, Table<VerbaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Verbale(Name alias, Table<VerbaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>VERBALE</code> table reference
     */
    public Verbale(String alias) {
        this(DSL.name(alias), VERBALE);
    }

    /**
     * Create an aliased <code>VERBALE</code> table reference
     */
    public Verbale(Name alias) {
        this(alias, VERBALE);
    }

    /**
     * Create a <code>VERBALE</code> table reference
     */
    public Verbale() {
        this(DSL.name("VERBALE"), null);
    }

    public <O extends Record> Verbale(Table<O> child, ForeignKey<O, VerbaleRecord> key) {
        super(child, key, VERBALE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<VerbaleRecord> getPrimaryKey() {
        return Keys.VERBALE__PK_VERBALE;
    }

    @Override
    public List<ForeignKey<VerbaleRecord, ?>> getReferences() {
        return Arrays.asList(Keys.VERBALE__FK_VERBALE_PK_OPERAZIONE);
    }

    private transient Operazione _operazione;

    /**
     * Get the implicit join path to the <code>OPERAZIONE</code> table.
     */
    public Operazione operazione() {
        if (_operazione == null)
            _operazione = new Operazione(this, Keys.VERBALE__FK_VERBALE_PK_OPERAZIONE);

        return _operazione;
    }

    @Override
    public Verbale as(String alias) {
        return new Verbale(DSL.name(alias), this);
    }

    @Override
    public Verbale as(Name alias) {
        return new Verbale(alias, this);
    }

    @Override
    public Verbale as(Table<?> alias) {
        return new Verbale(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Verbale rename(String name) {
        return new Verbale(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Verbale rename(Name name) {
        return new Verbale(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Verbale rename(Table<?> name) {
        return new Verbale(name.getQualifiedName(), null);
    }
}
