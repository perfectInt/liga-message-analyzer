package liga.medical.messageanalyzer.coreapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.messageanalyzer.coreapi.service.MessageService;
import liga.medical.messageanalyzer.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping(consumes = "application/json", produces = "application/json", value = "/send")
    public void sendMessage(@RequestBody MessageDto messageDto) throws JsonProcessingException {
        messageService.sendMessage(messageDto, "common_monitoring");
    }
}
