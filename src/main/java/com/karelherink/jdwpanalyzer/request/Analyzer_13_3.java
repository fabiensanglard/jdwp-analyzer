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
package com.karelherink.jdwpanalyzer.request;

import com.karelherink.jdwpanalyzer.entity.ObjectType;
import com.karelherink.jdwpanalyzer.model.Node;
import com.karelherink.jdwpanalyzer.model.Packet;
import com.karelherink.jdwpanalyzer.model.PacketAnalyzer;

/**
 * @author karel herink
 */
public class Analyzer_13_3 extends PacketAnalyzer {

    public Analyzer_13_3() {
    }
    
    public Node getPacketInfo(Packet packet) {
		Node root = new Node (null, null);
		int index = 0;
		
		long objTypeId = getVal(packet, index, objectIDSize);
		index += objectIDSize;
		ObjectType objType = ObjectType.getType(objTypeId);
		Node arrayInfo = new Node(new Node.Descriptor("ArrayObjectID:", objType), new Node.Value(new Long(objTypeId)));
		root.addChild(arrayInfo);
		
        int startIndex = (int) getVal(packet, index, 4);
        index += 4;
		Node startIndexInfo = new Node (new Node.Descriptor("FirstIndex:"), new Node.Value(new Integer(startIndex)));
		root.addChild(startIndexInfo);
		
        int length = (int) getVal(packet, index, 4);
        index += 4;
		Node lengthInfo = new Node (new Node.Descriptor("Length:"), new Node.Value(new Integer(length)));
		root.addChild(lengthInfo);
		
		return root;
	}

}
