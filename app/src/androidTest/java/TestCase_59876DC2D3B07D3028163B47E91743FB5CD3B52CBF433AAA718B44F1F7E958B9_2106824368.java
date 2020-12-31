import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.PageTransformer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59876DC2D3B07D3028163B47E91743FB5CD3B52CBF433AAA718B44F1F7E958B9_2106824368 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ViewPager.class);
      Object var1 = EasyMock.createMock(PageTransformer.class);
      ((ViewPager)var2).setPageTransformer(false, (PageTransformer)var1);
   }
}
