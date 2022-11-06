package com.observationclass.controller;

import com.observationclass.model.ApiResponse;
import com.observationclass.model.request.AccountRequest;
import com.observationclass.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/list-all")
    public ResponseEntity<ApiResponse> getListAdmin() {
        return ResponseEntity.ok().body(adminService.getListAccount());
    }

    @PostMapping("/new-account")
    public ResponseEntity<ApiResponse> addNewAccount(@RequestBody @Valid AccountRequest accountRequest) {
        return ResponseEntity.ok().body(adminService.addNewAccount(accountRequest));
    }

    @PostMapping("/edit-account")
    public ResponseEntity<ApiResponse> editAccount(@RequestBody @Valid AccountRequest accountRequest) {
        return ResponseEntity.ok().body(adminService.updateAccount(accountRequest));
    }

    @PostMapping("/delete-account")
    public ResponseEntity<ApiResponse> deleteAccount(@RequestParam(name = "id") Integer id) {
        return ResponseEntity.ok().body(adminService.deleteAccountById(id));
    }

    @GetMapping("/list-account-role")
    public ResponseEntity<ApiResponse> listAccountByRole(@RequestParam(name = "roleId") Integer roleId) {
        return ResponseEntity.ok().body(adminService.getAccountByRole(roleId));
    }
}
