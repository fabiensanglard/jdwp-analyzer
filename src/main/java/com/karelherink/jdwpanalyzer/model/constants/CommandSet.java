/*
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at http://www.netbeans.org/cddl.html
 * or http://www.netbeans.org/cddl.txt.
 *
 * When distributing Covered Code, include this CDDL Header Notice in each file
 * and include the License file at http://www.netbeans.org/cddl.txt.
 * If applicable, add the following below the CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 */

package com.karelherink.jdwpanalyzer.model.constants;

/**
 * @author karel herink
 */
public interface CommandSet {

    public static final byte VirtualMachine = 1;
    public static final byte ReferenceType = 2;
    public static final byte ClassType = 3;
    public static final byte ArrayType = 4;
    public static final byte InterfaceType = 5;
    public static final byte Method = 6;
    public static final byte Field = 8;
    public static final byte ObjectReference = 9;
    public static final byte StringReference = 10;
    public static final byte ThreadReference = 11;
    public static final byte ThreadGroupReference = 12;
    public static final byte ArrayReference = 13;
    public static final byte ClassLoaderReference = 14;
    public static final byte EventRequest = 15;
    public static final byte StackFrame = 16;
    public static final byte ClassObjectReference = 17;
    public static final byte Event = 64;

}
