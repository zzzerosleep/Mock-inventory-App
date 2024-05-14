package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        OutsourcedPart part1= new OutsourcedPart();
        part1.setCompanyName("Sram");
        part1.setName("Eagle GX Transmission");
        part1.setInv(5);
        part1.setPrice(499.99);
        part1.setId(1);
        part1.setMin(5);
        part1.setMax(6);
        outsourcedPartRepository.save(part1);

        OutsourcedPart part2= new OutsourcedPart();
        part2.setCompanyName("Canyon");
        part2.setName("Padded Shorts(Men's, M)");
        part2.setInv(14);
        part2.setPrice(34.99);
        part2.setId(2);
        part2.setMin(12);
        part2.setMax(16);
        outsourcedPartRepository.save(part2);

        OutsourcedPart part3= new OutsourcedPart();
        part3.setCompanyName("Smith");
        part3.setName("Helmet(L)");
        part3.setInv(10);
        part3.setPrice(35.99);
        part3.setId(3);
        part3.setMin(8);
        part3.setMax(12);
        outsourcedPartRepository.save(part3);

        OutsourcedPart part4= new OutsourcedPart();
        part4.setCompanyName("Giant");
        part4.setName("Extra padded seat");
        part4.setInv(23);
        part4.setPrice(67.99);
        part4.setId(4);
        part4.setMin(20);
        part4.setMax(25);
        outsourcedPartRepository.save(part4);

        OutsourcedPart part5= new OutsourcedPart();
        part5.setCompanyName("STEM");
        part5.setName("Presta Valve Stem");
        part5.setInv(250);
        part5.setPrice(1.99);
        part5.setId(5);
        part5.setMin(200);
        part5.setMax(300);
        outsourcedPartRepository.save(part5);

        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Eagle GX Transmission"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }


        Product ripmo= new Product("Ibis Ripmo AF(M)",2600.99,6);
        Product spectral= new Product("Canyon Spectral(L)",1699.99,2);
        Product huffy= new Product("Rusty Huffy kids bike",12.50,1);
        Product tyee= new Product("Propain Tyee AL 27.5 (M)" ,4999.99,8);
        Product rallon= new Product("Orbella Rallon",3499.99,12);
        productRepository.save(ripmo);
        productRepository.save(spectral);
        productRepository.save(huffy);
        productRepository.save(tyee);
        productRepository.save(rallon);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

