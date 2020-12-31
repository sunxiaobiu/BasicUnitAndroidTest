import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6371BFBD26D1494E8675D9105338FDF9C78FE06ACBAA214038DA181719E00E9D__380263700 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var3);
      Builder var4 = var1;
      Object var5 = EasyMock.createMock(ListAdapter.class);
      Object var2 = EasyMock.createMock(OnClickListener.class);
      var4.setAdapter((ListAdapter)var5, (OnClickListener)var2);
   }
}
