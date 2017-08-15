package me.ratna.daverentallist.controller;

import me.ratna.daverentallist.model.ListingAd;
import me.ratna.daverentallist.repository.ListingAdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController
{
    @Autowired
    ListingAdRepo listingAdRepo;

    @GetMapping("/")
    public String home()
    {
        return "welcome";
    }

    @GetMapping("/welcome")
    public String start()
    {
        return "welcome";
    }

    @GetMapping("/addroom")
    public String addRental(Model model)
    {
        model.addAttribute("newListingAd", new ListingAd());
        return "addroom";
    }

    @PostMapping("/addroom")
    public String submitRental(@Valid @ModelAttribute("rental") ListingAd ad, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "addroom";
        }
        listingAdRepo.save(ad);
        return "welcome";
    }

    @GetMapping("/showallroom")
    public String showRentals(Model model)
    {
        Iterable<ListingAd> ads = listingAdRepo.findAll();
        model.addAttribute("ads", ads);
        return "showallroom";
    }

    @GetMapping("/editroom")
    public String editRentals(@ModelAttribute("rental") ListingAd listingAd, Model model)
    {
        Iterable<ListingAd> ads = listingAdRepo.findAll();
        model.addAttribute("ads", ads);
        return "editroom";
    }
}

