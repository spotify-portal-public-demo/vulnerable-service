package com.spotify.demo.artist;

import org.springframework.stereotype.Service;
import com.spotify.demo.artist.proto.HelloReply;
import com.spotify.demo.artist.proto.HelloRequest;
import com.spotify.demo.artist.proto.SimpleGrpc;
import io.grpc.stub.StreamObserver;

@Service
class SimpleGrpcService extends SimpleGrpc.SimpleImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello: " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
