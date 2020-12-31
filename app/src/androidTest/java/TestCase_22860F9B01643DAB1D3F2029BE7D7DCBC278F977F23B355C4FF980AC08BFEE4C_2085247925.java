import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_22860F9B01643DAB1D3F2029BE7D7DCBC278F977F23B355C4FF980AC08BFEE4C_2085247925 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(ColorStateList.class);
      ViewCompat.setBackgroundTintList((View)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
