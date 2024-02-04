/*
 * This file is generated by jOOQ.
 */
package model.generated;


import java.util.Arrays;
import java.util.List;

import model.generated.tables.Anagrafiche;
import model.generated.tables.Dipendente;
import model.generated.tables.Interventi;
import model.generated.tables.ListeAttesa;
import model.generated.tables.ListeOperatorie;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>ANAGRAFICHE</code>.
     */
    public final Anagrafiche ANAGRAFICHE = Anagrafiche.ANAGRAFICHE;

    /**
     * The table <code>DIPENDENTE</code>.
     */
    public final Dipendente DIPENDENTE = Dipendente.DIPENDENTE;

    /**
     * The table <code>INTERVENTI</code>.
     */
    public final Interventi INTERVENTI = Interventi.INTERVENTI;

    /**
     * The table <code>LISTE_ATTESA</code>.
     */
    public final ListeAttesa LISTE_ATTESA = ListeAttesa.LISTE_ATTESA;

    /**
     * The table <code>LISTE_OPERATORIE</code>.
     */
    public final ListeOperatorie LISTE_OPERATORIE = ListeOperatorie.LISTE_OPERATORIE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Anagrafiche.ANAGRAFICHE,
            Dipendente.DIPENDENTE,
            Interventi.INTERVENTI,
            ListeAttesa.LISTE_ATTESA,
            ListeOperatorie.LISTE_OPERATORIE
        );
    }
}
