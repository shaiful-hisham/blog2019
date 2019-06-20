/*
 * This file is generated by jOOQ.
 */
package ch.rasc.totp.db.tables;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ch.rasc.totp.db.DefaultSchema;
import ch.rasc.totp.db.Indexes;
import ch.rasc.totp.db.Keys;
import ch.rasc.totp.db.tables.records.AppUserRecord;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppUser extends TableImpl<AppUserRecord> {

  private static final long serialVersionUID = 2096723260;

  /**
   * The reference instance of <code>APP_USER</code>
   */
  public static final AppUser APP_USER = new AppUser();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<AppUserRecord> getRecordType() {
    return AppUserRecord.class;
  }

  /**
   * The column <code>APP_USER.ID</code>.
   */
  public final TableField<AppUserRecord, Long> ID = createField("ID",
      org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

  /**
   * The column <code>APP_USER.USERNAME</code>.
   */
  public final TableField<AppUserRecord, String> USERNAME = createField("USERNAME",
      org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

  /**
   * The column <code>APP_USER.PASSWORD_HASH</code>.
   */
  public final TableField<AppUserRecord, String> PASSWORD_HASH = createField(
      "PASSWORD_HASH", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

  /**
   * The column <code>APP_USER.SECRET</code>.
   */
  public final TableField<AppUserRecord, String> SECRET = createField("SECRET",
      org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

  /**
   * The column <code>APP_USER.ENABLED</code>.
   */
  public final TableField<AppUserRecord, Boolean> ENABLED = createField("ENABLED",
      org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

  /**
   * Create a <code>APP_USER</code> table reference
   */
  public AppUser() {
    this(DSL.name("APP_USER"), null);
  }

  /**
   * Create an aliased <code>APP_USER</code> table reference
   */
  public AppUser(String alias) {
    this(DSL.name(alias), APP_USER);
  }

  /**
   * Create an aliased <code>APP_USER</code> table reference
   */
  public AppUser(Name alias) {
    this(alias, APP_USER);
  }

  private AppUser(Name alias, Table<AppUserRecord> aliased) {
    this(alias, aliased, null);
  }

  private AppUser(Name alias, Table<AppUserRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> AppUser(Table<O> child, ForeignKey<O, AppUserRecord> key) {
    super(child, key, APP_USER);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Schema getSchema() {
    return DefaultSchema.DEFAULT_SCHEMA;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_7, Indexes.PRIMARY_KEY_7);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Identity<AppUserRecord, Long> getIdentity() {
    return Keys.IDENTITY_APP_USER;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<AppUserRecord> getPrimaryKey() {
    return Keys.CONSTRAINT_7;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<AppUserRecord>> getKeys() {
    return Arrays.<UniqueKey<AppUserRecord>>asList(Keys.CONSTRAINT_7, Keys.CONSTRAINT_76);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public AppUser as(String alias) {
    return new AppUser(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public AppUser as(Name alias) {
    return new AppUser(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public AppUser rename(String name) {
    return new AppUser(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public AppUser rename(Name name) {
    return new AppUser(name, null);
  }
}
