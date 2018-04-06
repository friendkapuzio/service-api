/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;


import com.epam.ta.reportportal.store.jooq.enums.JAuthTypeEnum;
import com.epam.ta.reportportal.store.jooq.tables.JBugTrackingSystemAuth;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JBugTrackingSystemAuthRecord extends UpdatableRecordImpl<JBugTrackingSystemAuthRecord> implements Record6<Long, JAuthTypeEnum, String, String, String, String> {

    private static final long serialVersionUID = 1787094757;

    /**
     * Setter for <code>public.bug_tracking_system_auth.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bug_tracking_system_auth.auth_type</code>.
     */
    public void setAuthType(JAuthTypeEnum value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.auth_type</code>.
     */
    public JAuthTypeEnum getAuthType() {
        return (JAuthTypeEnum) get(1);
    }

    /**
     * Setter for <code>public.bug_tracking_system_auth.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bug_tracking_system_auth.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.bug_tracking_system_auth.domain</code>.
     */
    public void setDomain(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.domain</code>.
     */
    public String getDomain() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.bug_tracking_system_auth.accesskey</code>.
     */
    public void setAccesskey(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system_auth.accesskey</code>.
     */
    public String getAccesskey() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, JAuthTypeEnum, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, JAuthTypeEnum, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JAuthTypeEnum> field2() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.AUTH_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.DOMAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.ACCESSKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAuthTypeEnum component2() {
        return getAuthType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAccesskey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAuthTypeEnum value2() {
        return getAuthType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAccesskey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value2(JAuthTypeEnum value) {
        setAuthType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value5(String value) {
        setDomain(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord value6(String value) {
        setAccesskey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemAuthRecord values(Long value1, JAuthTypeEnum value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JBugTrackingSystemAuthRecord
     */
    public JBugTrackingSystemAuthRecord() {
        super(JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH);
    }

    /**
     * Create a detached, initialised JBugTrackingSystemAuthRecord
     */
    public JBugTrackingSystemAuthRecord(Long id, JAuthTypeEnum authType, String username, String password, String domain, String accesskey) {
        super(JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH);

        set(0, id);
        set(1, authType);
        set(2, username);
        set(3, password);
        set(4, domain);
        set(5, accesskey);
    }
}
