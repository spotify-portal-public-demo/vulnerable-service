package com.spotify.demo.artist;

import org.springframework.stereotype.Service;
import com.spotify.demo.artist.proto.AddArtistsRequest;
import com.spotify.demo.artist.proto.AddArtistsResponse;
import com.spotify.demo.artist.proto.ArtistServiceGrpc.ArtistServiceImplBase;
import com.spotify.demo.artist.proto.GetArtistsRequest;
import com.spotify.demo.artist.proto.GetArtistsResponse;
import com.spotify.demo.artist.proto.RemoveArtistsRequest;
import com.spotify.demo.artist.proto.RemoveArtistsResponse;
import io.grpc.stub.StreamObserver;

@Service
class ArtistService extends ArtistServiceImplBase {

  @Override
  public void getArtists(GetArtistsRequest req,
      StreamObserver<GetArtistsResponse> responseObserver) {
    var reply = GetArtistsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void addArtists(AddArtistsRequest req,
      StreamObserver<AddArtistsResponse> responseObserver) {
    var reply = AddArtistsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void removeArtists(RemoveArtistsRequest req,
      StreamObserver<RemoveArtistsResponse> responseObserver) {
    var reply = RemoveArtistsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

}
