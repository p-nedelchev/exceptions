import org.omg.CORBA.*;

/**
 * Created by clouway on 10.05.16.
 */
public class Object implements org.omg.CORBA.Object {
    @Override
    public boolean _is_a(String repositoryIdentifier) {
        return false;
    }

    @Override
    public boolean _is_equivalent(org.omg.CORBA.Object other) {
        return false;
    }

    @Override
    public boolean _non_existent() {
        return false;
    }

    @Override
    public int _hash(int maximum) {
        return 0;
    }

    @Override
    public org.omg.CORBA.Object _duplicate() {
        return null;
    }

    @Override
    public void _release() {

    }

    @Override
    public org.omg.CORBA.Object _get_interface_def() {
        return null;
    }

    @Override
    public Request _request(String operation) {
        return null;
    }

    @Override
    public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result) {
        return null;
    }

    @Override
    public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result, ExceptionList exclist, ContextList ctxlist) {
        return null;
    }

    @Override
    public Policy _get_policy(int policy_type) {
        return null;
    }

    @Override
    public DomainManager[] _get_domain_managers() {
        return new DomainManager[0];
    }

    @Override
    public org.omg.CORBA.Object _set_policy_override(Policy[] policies, SetOverrideType set_add) {
        return null;
    }
}
