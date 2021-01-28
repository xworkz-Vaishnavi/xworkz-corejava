package com.xworkz.xworkzapp.dao;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.xworkzapp.constants.CosmeticsType;
import com.xworkz.xworkzapp.dto.CosmeticsDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticsDTO> cosmetics;
	
	public CosmeticDAOImpl() {
		this.cosmetics=new ArrayList<CosmeticsDTO>();
	}
		
	@Override
	public boolean save(CosmeticsDTO dto) {
		// TODO Auto-generated method stub
		boolean added=false;
		boolean contains=this.cosmetics.contains(dto);
		if(!contains) {	
		 added=this.cosmetics.add(dto);
		}
		if(added)
			System.out.println("cosmetic added"+dto);
		else
			System.out.println("cosmetic not added");
		return added;
	}
	
	@Override
	public CosmeticsDTO findbyQuantityAndBrand(int quantity, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByQuantityandBrand");
		for (CosmeticsDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			int quantityFromDTO=cosmeticDTO.getQuantity();
			if ( brandFromDTO.equals(brand) && quantityFromDTO==(quantity)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}
	
	public CosmeticsDTO findbyTypeAndBrand(CosmeticsType cosmeticType, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked findByquantityandbrad");
		for (CosmeticsDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO = cosmeticDTO.getBrand();
			CosmeticsType cosmeticFromDTO=cosmeticDTO.getType();
			if ( brandFromDTO.equals(brand) && cosmeticFromDTO.equals(cosmeticType)) {
				System.out.println("cosmetic found");
				return cosmeticDTO;
			}
		}
		return null;
	}
	
	@Override
	public boolean updatePriceAndQuantityByBrand(double price,int quantity, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("Quantity: "+quantity);
		System.out.println("Brand: "+brand);
		CosmeticsDTO dtoFromCosmetic = this.findbyQuantityAndBrand(quantity, brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;
	}

    @Override
	public boolean updatePriceByBrandandType(double price, String brand, CosmeticsType type) {
		// TODO Auto-generated method stub
		System.out.println("invoked updatePriceAndQuantityByBrand ");
		System.out.println("type: "+type);
		System.out.println("Brand: "+brand);
		CosmeticsDTO dtoFromCosmetic = this.findbyTypeAndBrand(type, brand);
		if (dtoFromCosmetic != null) {
			System.out.println("can update , cosmetic is found");
			dtoFromCosmetic.setPrice(price);
			return true;
		} else {
			System.out.println("cannot update , cosmetic not found");
		}
		return false;
	}
	
	@Override
	public boolean updateTypeByBrand(CosmeticsType type, String brand) {
		// TODO Auto-generated method stub
		System.out.println("invoked updateTypeByBrand");
		System.out.println("Brand: "+brand);
		for (CosmeticsDTO cosmeticDTO : this.cosmetics) {
			String brandFromDTO=cosmeticDTO.getBrand();
			if (brandFromDTO.equals(brand)) {
				System.out.println("cosmetic found");
				cosmeticDTO.setType(type);
				return true;
			}
			else {
				System.out.println("cannot update , cosmetic not found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		for (CosmeticsDTO cosDTO : this.cosmetics) {
			String brandFromDTO = cosDTO.getBrand();
			if ( brandFromDTO.equals(brand) ) {	
			this.cosmetics.remove(cosDTO);
			System.out.println("deleted");
			return true;
			
			}
		}
		return false;
	}
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		//cosmetics.removeAll(cosmetics);
		this.cosmetics.clear();
		
	}

	 @Override 
	  public List<CosmeticsDTO> getAll() {
			
			/*
			 * for (CosmeticsDTO cosmeticDTO : this.cosmetics) {
			 * System.out.println(cosmeticDTO.getBrand()+" "+cosmeticDTO.getPrice()+" "
			 * +cosmeticDTO.getQuantity()+" "+cosmeticDTO.getCosmeticsShade()+" "
			 * +cosmeticDTO .getCosmeticsType()); }
			 */
			 
		return this.cosmetics; 
	 
	  }
	 
	@Override
	public int TotalSize() {
		// TODO Auto-generated method stub
		int totalSize=cosmetics.size();
		System.out.println(totalSize);
		return 0;
	}

	@Override
	public boolean updateTypeByBrand(String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	
}