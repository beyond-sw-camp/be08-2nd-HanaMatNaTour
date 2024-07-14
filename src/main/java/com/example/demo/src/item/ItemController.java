package com.example.demo.src.item;


import com.example.demo.src.item.dto.ItemSaveReq;
import com.example.demo.src.item.dto.ItemUpdateReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    // Item 저장 API
    @PostMapping("")
    public String saveItem(@RequestBody ItemSaveReq item) {
        itemService.saveItem(item);
        return "저장 완료";
    }

    // Item 수정 API
    @PatchMapping("")
    public String updateItem(@RequestBody ItemUpdateReq item) {
        itemService.updateItem(item);
        return "수정 완료";
    }




}
