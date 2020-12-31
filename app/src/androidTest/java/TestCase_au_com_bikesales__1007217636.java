import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bikesales__1007217636 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FragmentActivity.class);
      ViewPager var1 = new ViewPager((Context)var2);
      var1.setTransitionName("detail_gallery");
   }
}
