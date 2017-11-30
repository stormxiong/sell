package com.xpc.controller;

import com.xpc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xpc on 2017/11/30.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        return resultVO;
    }
} 
