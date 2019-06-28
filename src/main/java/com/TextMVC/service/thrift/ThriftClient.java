package com.TextMVC.service.thrift;

import com.external.vispeech.SpeechOperator;
import com.external.vnluservice.NLUOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class ThriftClient {
    private final Logger logger = LogManager.getLogger(ThriftClient.class);

    private final String host = "172.16.113.207"; // "localhost"

    private TTransport tTransport;

    private int port;

    public ThriftClient(int port)
    {
        this.port = port;
    }

    public SpeechOperator.Client client() throws TTransportException {
        tTransport = new TSocket(host, port);
        tTransport.open();
        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory();
        return new SpeechOperator.Client(tProtocolFactory.getProtocol(tTransport));
    }

    // TODO: use templet
    public NLUOperator.Client nlp_client() throws TTransportException {
        tTransport = new TSocket(host, port);
        tTransport.open();
        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory();
        return new NLUOperator.Client(tProtocolFactory.getProtocol(tTransport));
    }

    public void close(){
        if (tTransport.isOpen())
            tTransport.close();
    }
}
