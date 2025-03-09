package org.leocoder.dev.teach.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;
/**
 * @author : 程序员Leo
 * @date 2025-03-09 23:02
 * @version 1.0
 * @description :Api接口
 */
public interface IAiService {


    /**
     * 生成普通回复
     * @param model 模型
     * @param message 消息
     * @return 回复
     */
    ChatResponse generate(String model, String message);


    /**
     * 生成流式回复
     * @param model 模型
     * @param message 消息
     * @return 流式回复
     */
    Flux<ChatResponse> generateStream(String model, String message);

}
