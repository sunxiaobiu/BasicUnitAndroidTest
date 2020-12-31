import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AlertDialog.Builder;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_1991377269 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var1);
      Object var4 = EasyMock.createMock(ArrayAdapter.class);
      Object var2 = null;
      var3.setAdapter((ListAdapter)var4, (OnClickListener)var2);
   }
}
