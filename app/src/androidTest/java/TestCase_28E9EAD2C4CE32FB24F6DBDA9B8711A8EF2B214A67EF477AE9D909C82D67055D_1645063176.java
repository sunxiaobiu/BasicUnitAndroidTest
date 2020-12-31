import android.content.Context;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_28E9EAD2C4CE32FB24F6DBDA9B8711A8EF2B214A67EF477AE9D909C82D67055D_1645063176 {
   @Test
   public void testCase() throws Exception {
      ResourceManagerInternal var3 = ResourceManagerInternal.get();
      Object var1 = EasyMock.createMock(Context.class);
      byte var2 = 1;
      var3.getDrawable((Context)var1, var2);
   }
}
