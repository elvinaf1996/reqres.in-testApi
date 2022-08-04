package tests.api;

import api.ResourceApi;
import api.Support;
import api.models.getResourse.GetResource;
import api.models.getResourse.GetResources;
import api.models.getResourse.ResourceData;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GettingResourceTest {
    String url = "https://reqres.in/#support-heading";
    String text = "To keep ReqRes free, contributions towards server costs are appreciated!";
    Support support = new Support(url,text);

    @Test
    public void checkingGetResource() {
        int resourceId = 2;
        String name = "fuchsia rose";
        int year = 2001;
        String color = "C74375";
        String pantoneValue = "17-2031";
        ResourceData resourceData = new ResourceData(resourceId, name, year, color, pantoneValue);

        GetResource getResource = ResourceApi.getResourceSuccess(resourceId);

        assertEquals(getResource.getData(), resourceData);
        assertEquals(getResource.getSupport(), support);
    }

    @Test
    public void checkingGetResourceFail() {
        int resourceId = 23;
        ResourceApi.getResourceFail(resourceId);
    }

    @Test
    public void checkingGetResources(){
        int page = 1;
        int per_page = 6;
        int total = 12;
        int totalPages = 2;
        ArrayList<ResourceData> resourceData = new ArrayList<> ();
        resourceData.add(new ResourceData(1, "cerulean", 2000, "#98B2D1", "15-4020"));
        resourceData.add(new ResourceData(2, "fuchsia rose", 2001, "#C74375", "17-2031"));
        resourceData.add(new ResourceData(3, "aqua sky", 2003, "#7BC4C4", "14-4811"));
        resourceData.add(new ResourceData(5, "tigerlily", 2004, "#E2583E", "17-1456"));
        resourceData.add(new ResourceData(6, "blue turquoise", 2005, "#53B0AE", "15-5217"));

        GetResources getResources = ResourceApi.getResourcesSuccess();
        assertEquals(getResources.getPage(), page);
        assertEquals(getResources.getPerPage(), per_page);
        assertEquals(getResources.getTotal(), total);
        assertEquals(getResources.getTotalPages(), totalPages);
        assertEquals(getResources.getData(), resourceData);
        assertEquals(getResources.getSupport(), support);

    }


}
