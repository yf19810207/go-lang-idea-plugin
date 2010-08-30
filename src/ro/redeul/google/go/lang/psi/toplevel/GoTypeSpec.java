package ro.redeul.google.go.lang.psi.toplevel;

import ro.redeul.google.go.lang.psi.GoPsiElement;
import ro.redeul.google.go.lang.psi.types.GoType;
import ro.redeul.google.go.lang.psi.types.GoTypeName;

/**
 * Created by IntelliJ IDEA.
 * User: mtoader
 * Date: Aug 30, 2010
 * Time: 8:56:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GoTypeSpec extends GoPsiElement {

    GoTypeName getTypeName();

    GoType getType();
}
