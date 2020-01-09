/*
 * This file is generated by jOOQ.
 */
package ch.rasc.stateless.db;


import ch.rasc.stateless.db.tables.AppSession;
import ch.rasc.stateless.db.tables.AppUser;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CONSTRAINT_INDEX_A = Indexes0.CONSTRAINT_INDEX_A;
    public static final Index PRIMARY_KEY_A = Indexes0.PRIMARY_KEY_A;
    public static final Index CONSTRAINT_INDEX_7 = Indexes0.CONSTRAINT_INDEX_7;
    public static final Index PRIMARY_KEY_7 = Indexes0.PRIMARY_KEY_7;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CONSTRAINT_INDEX_A = Internal.createIndex("CONSTRAINT_INDEX_A", AppSession.APP_SESSION, new OrderField[] { AppSession.APP_SESSION.APP_USER_ID }, false);
        public static Index PRIMARY_KEY_A = Internal.createIndex("PRIMARY_KEY_A", AppSession.APP_SESSION, new OrderField[] { AppSession.APP_SESSION.ID }, true);
        public static Index CONSTRAINT_INDEX_7 = Internal.createIndex("CONSTRAINT_INDEX_7", AppUser.APP_USER, new OrderField[] { AppUser.APP_USER.EMAIL }, true);
        public static Index PRIMARY_KEY_7 = Internal.createIndex("PRIMARY_KEY_7", AppUser.APP_USER, new OrderField[] { AppUser.APP_USER.ID }, true);
    }
}
