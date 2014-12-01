/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.apache.activemq.tests.integration.jms.client;

import javax.jms.ConnectionFactory;
import javax.jms.Message;

import org.apache.activemq.api.core.TransportConfiguration;
import org.apache.activemq.api.jms.ActiveMQJMSClient;
import org.apache.activemq.api.jms.JMSFactoryType;
import org.apache.activemq.jms.client.ActiveMQJMSConnectionFactory;

/**
 * A AutoGroupingTest
 *
 * @author Tim Fox
 *
 *
 */
public class AutoGroupingTest extends GroupingTest
{

   @Override
   protected ConnectionFactory getCF() throws Exception
   {
      ActiveMQJMSConnectionFactory cf1 =
               (ActiveMQJMSConnectionFactory) ActiveMQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.CF,
                                                                                                new TransportConfiguration(
                                                                                                   INVM_CONNECTOR_FACTORY));

      cf1.setAutoGroup(true);

      return cf1;
   }

   @Override
   protected void setProperty(Message message)
   {
   }

}