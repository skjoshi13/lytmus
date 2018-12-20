package com.arq.lytmus.services;

import com.fasterxml.jackson.databind.JsonNode;

public interface ILoginService {

    void login(JsonNode Payload);

}

