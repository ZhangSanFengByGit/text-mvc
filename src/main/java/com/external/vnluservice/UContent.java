package com.external.vnluservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-18")
public class UContent implements org.apache.thrift.TBase<UContent, UContent._Fields>, java.io.Serializable, Cloneable, Comparable<UContent> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UContent");

    private static final org.apache.thrift.protocol.TField SKILL_FIELD_DESC = new org.apache.thrift.protocol.TField("skill", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.STRING, (short)2);
    private static final org.apache.thrift.protocol.TField PAYLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("payload", org.apache.thrift.protocol.TType.STRING, (short)3);
    private static final org.apache.thrift.protocol.TField PARENT_FIELD_DESC = new org.apache.thrift.protocol.TField("parent", org.apache.thrift.protocol.TType.STRING, (short)4);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UContentStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UContentTupleSchemeFactory();

    public java.lang.String skill; // required
    public java.lang.String action; // required
    public java.lang.String payload; // required
    public java.lang.String parent; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        SKILL((short)1, "skill"),
        ACTION((short)2, "action"),
        PAYLOAD((short)3, "payload"),
        PARENT((short)4, "parent");

        private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch(fieldId) {
                case 1: // SKILL
                    return SKILL;
                case 2: // ACTION
                    return ACTION;
                case 3: // PAYLOAD
                    return PAYLOAD;
                case 4: // PARENT
                    return PARENT;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(java.lang.String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final java.lang.String _fieldName;

        _Fields(short thriftId, java.lang.String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public java.lang.String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SKILL, new org.apache.thrift.meta_data.FieldMetaData("skill", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PAYLOAD, new org.apache.thrift.meta_data.FieldMetaData("payload", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PARENT, new org.apache.thrift.meta_data.FieldMetaData("parent", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UContent.class, metaDataMap);
    }

    public UContent() {
    }

    public UContent(
            java.lang.String skill,
            java.lang.String action,
            java.lang.String payload,
            java.lang.String parent)
    {
        this();
        this.skill = skill;
        this.action = action;
        this.payload = payload;
        this.parent = parent;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public UContent(UContent other) {
        if (other.isSetSkill()) {
            this.skill = other.skill;
        }
        if (other.isSetAction()) {
            this.action = other.action;
        }
        if (other.isSetPayload()) {
            this.payload = other.payload;
        }
        if (other.isSetParent()) {
            this.parent = other.parent;
        }
    }

    public UContent deepCopy() {
        return new UContent(this);
    }

    @Override
    public void clear() {
        this.skill = null;
        this.action = null;
        this.payload = null;
        this.parent = null;
    }

    public java.lang.String getSkill() {
        return this.skill;
    }

    public UContent setSkill(java.lang.String skill) {
        this.skill = skill;
        return this;
    }

    public void unsetSkill() {
        this.skill = null;
    }

    /** Returns true if field skill is set (has been assigned a value) and false otherwise */
    public boolean isSetSkill() {
        return this.skill != null;
    }

    public void setSkillIsSet(boolean value) {
        if (!value) {
            this.skill = null;
        }
    }

    public java.lang.String getAction() {
        return this.action;
    }

    public UContent setAction(java.lang.String action) {
        this.action = action;
        return this;
    }

    public void unsetAction() {
        this.action = null;
    }

    /** Returns true if field action is set (has been assigned a value) and false otherwise */
    public boolean isSetAction() {
        return this.action != null;
    }

    public void setActionIsSet(boolean value) {
        if (!value) {
            this.action = null;
        }
    }

    public java.lang.String getPayload() {
        return this.payload;
    }

    public UContent setPayload(java.lang.String payload) {
        this.payload = payload;
        return this;
    }

    public void unsetPayload() {
        this.payload = null;
    }

    /** Returns true if field payload is set (has been assigned a value) and false otherwise */
    public boolean isSetPayload() {
        return this.payload != null;
    }

    public void setPayloadIsSet(boolean value) {
        if (!value) {
            this.payload = null;
        }
    }

    public java.lang.String getParent() {
        return this.parent;
    }

    public UContent setParent(java.lang.String parent) {
        this.parent = parent;
        return this;
    }

    public void unsetParent() {
        this.parent = null;
    }

    /** Returns true if field parent is set (has been assigned a value) and false otherwise */
    public boolean isSetParent() {
        return this.parent != null;
    }

    public void setParentIsSet(boolean value) {
        if (!value) {
            this.parent = null;
        }
    }

    public void setFieldValue(_Fields field, java.lang.Object value) {
        switch (field) {
            case SKILL:
                if (value == null) {
                    unsetSkill();
                } else {
                    setSkill((java.lang.String)value);
                }
                break;

            case ACTION:
                if (value == null) {
                    unsetAction();
                } else {
                    setAction((java.lang.String)value);
                }
                break;

            case PAYLOAD:
                if (value == null) {
                    unsetPayload();
                } else {
                    setPayload((java.lang.String)value);
                }
                break;

            case PARENT:
                if (value == null) {
                    unsetParent();
                } else {
                    setParent((java.lang.String)value);
                }
                break;

        }
    }

    public java.lang.Object getFieldValue(_Fields field) {
        switch (field) {
            case SKILL:
                return getSkill();

            case ACTION:
                return getAction();

            case PAYLOAD:
                return getPayload();

            case PARENT:
                return getParent();

        }
        throw new java.lang.IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new java.lang.IllegalArgumentException();
        }

        switch (field) {
            case SKILL:
                return isSetSkill();
            case ACTION:
                return isSetAction();
            case PAYLOAD:
                return isSetPayload();
            case PARENT:
                return isSetParent();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof UContent)
            return this.equals((UContent)that);
        return false;
    }

    public boolean equals(UContent that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_skill = true && this.isSetSkill();
        boolean that_present_skill = true && that.isSetSkill();
        if (this_present_skill || that_present_skill) {
            if (!(this_present_skill && that_present_skill))
                return false;
            if (!this.skill.equals(that.skill))
                return false;
        }

        boolean this_present_action = true && this.isSetAction();
        boolean that_present_action = true && that.isSetAction();
        if (this_present_action || that_present_action) {
            if (!(this_present_action && that_present_action))
                return false;
            if (!this.action.equals(that.action))
                return false;
        }

        boolean this_present_payload = true && this.isSetPayload();
        boolean that_present_payload = true && that.isSetPayload();
        if (this_present_payload || that_present_payload) {
            if (!(this_present_payload && that_present_payload))
                return false;
            if (!this.payload.equals(that.payload))
                return false;
        }

        boolean this_present_parent = true && this.isSetParent();
        boolean that_present_parent = true && that.isSetParent();
        if (this_present_parent || that_present_parent) {
            if (!(this_present_parent && that_present_parent))
                return false;
            if (!this.parent.equals(that.parent))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + ((isSetSkill()) ? 131071 : 524287);
        if (isSetSkill())
            hashCode = hashCode * 8191 + skill.hashCode();

        hashCode = hashCode * 8191 + ((isSetAction()) ? 131071 : 524287);
        if (isSetAction())
            hashCode = hashCode * 8191 + action.hashCode();

        hashCode = hashCode * 8191 + ((isSetPayload()) ? 131071 : 524287);
        if (isSetPayload())
            hashCode = hashCode * 8191 + payload.hashCode();

        hashCode = hashCode * 8191 + ((isSetParent()) ? 131071 : 524287);
        if (isSetParent())
            hashCode = hashCode * 8191 + parent.hashCode();

        return hashCode;
    }

    @Override
    public int compareTo(UContent other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = java.lang.Boolean.valueOf(isSetSkill()).compareTo(other.isSetSkill());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSkill()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skill, other.skill);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAction()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetPayload()).compareTo(other.isSetPayload());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPayload()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payload, other.payload);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = java.lang.Boolean.valueOf(isSetParent()).compareTo(other.isSetParent());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetParent()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parent, other.parent);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        scheme(oprot).write(oprot, this);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UContent(");
        boolean first = true;

        sb.append("skill:");
        if (this.skill == null) {
            sb.append("null");
        } else {
            sb.append(this.skill);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("action:");
        if (this.action == null) {
            sb.append("null");
        } else {
            sb.append(this.action);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("payload:");
        if (this.payload == null) {
            sb.append("null");
        } else {
            sb.append(this.payload);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("parent:");
        if (this.parent == null) {
            sb.append("null");
        } else {
            sb.append(this.parent);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class UContentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public UContentStandardScheme getScheme() {
            return new UContentStandardScheme();
        }
    }

    private static class UContentStandardScheme extends org.apache.thrift.scheme.StandardScheme<UContent> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, UContent struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // SKILL
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.skill = iprot.readString();
                            struct.setSkillIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // ACTION
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.action = iprot.readString();
                            struct.setActionIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // PAYLOAD
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.payload = iprot.readString();
                            struct.setPayloadIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // PARENT
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.parent = iprot.readString();
                            struct.setParentIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, UContent struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.skill != null) {
                oprot.writeFieldBegin(SKILL_FIELD_DESC);
                oprot.writeString(struct.skill);
                oprot.writeFieldEnd();
            }
            if (struct.action != null) {
                oprot.writeFieldBegin(ACTION_FIELD_DESC);
                oprot.writeString(struct.action);
                oprot.writeFieldEnd();
            }
            if (struct.payload != null) {
                oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
                oprot.writeString(struct.payload);
                oprot.writeFieldEnd();
            }
            if (struct.parent != null) {
                oprot.writeFieldBegin(PARENT_FIELD_DESC);
                oprot.writeString(struct.parent);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class UContentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public UContentTupleScheme getScheme() {
            return new UContentTupleScheme();
        }
    }

    private static class UContentTupleScheme extends org.apache.thrift.scheme.TupleScheme<UContent> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, UContent struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetSkill()) {
                optionals.set(0);
            }
            if (struct.isSetAction()) {
                optionals.set(1);
            }
            if (struct.isSetPayload()) {
                optionals.set(2);
            }
            if (struct.isSetParent()) {
                optionals.set(3);
            }
            oprot.writeBitSet(optionals, 4);
            if (struct.isSetSkill()) {
                oprot.writeString(struct.skill);
            }
            if (struct.isSetAction()) {
                oprot.writeString(struct.action);
            }
            if (struct.isSetPayload()) {
                oprot.writeString(struct.payload);
            }
            if (struct.isSetParent()) {
                oprot.writeString(struct.parent);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, UContent struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            java.util.BitSet incoming = iprot.readBitSet(4);
            if (incoming.get(0)) {
                struct.skill = iprot.readString();
                struct.setSkillIsSet(true);
            }
            if (incoming.get(1)) {
                struct.action = iprot.readString();
                struct.setActionIsSet(true);
            }
            if (incoming.get(2)) {
                struct.payload = iprot.readString();
                struct.setPayloadIsSet(true);
            }
            if (incoming.get(3)) {
                struct.parent = iprot.readString();
                struct.setParentIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}

