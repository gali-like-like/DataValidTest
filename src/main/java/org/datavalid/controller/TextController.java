package org.datavalid.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.datavalid.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class TextController {

    @GetMapping("/user")
    public String getUserById(@Valid @Min(message = "id必须大于等于1",value=1) Integer id) {
        if (id >= 100) {
            return "这是一个比100大的数字";
        }
        else
            return "这是一个比100小的数字";
    }

    @PostMapping("/postAdd")
    public String postAdd(@Valid @RequestBody  User user) {
        return user.toString();
    }

    @GetMapping("/getAdd")
    //这也无法验证
    public String getAdd(@Valid User user) {
        return user.toString();
    }

    @GetMapping("/get_add")
    public String get_add(@RequestBody @Valid User user) {
        return user.toString();
    }

    @PutMapping("/putAdd")
    public String putAdd(@Valid @RequestBody User user) {
        return user.toString();
    }

    @DeleteMapping("/deleteAdd")
    public String deleteAdd(@Valid @RequestBody User user) {
        return user.toString();
    }
}
