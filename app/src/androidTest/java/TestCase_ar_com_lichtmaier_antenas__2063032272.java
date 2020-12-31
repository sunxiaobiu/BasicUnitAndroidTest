import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__2063032272 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(View.class);
      int var1 = ((View)var3).getHeight();
      int var2 = ((View)var3).getWidth();
      ActivityOptionsCompat var4 = ActivityOptionsCompat.makeScaleUpAnimation((View)var3, 0, 0, var2, var1);
      Bundle var5 = var4.toBundle();
   }
}
