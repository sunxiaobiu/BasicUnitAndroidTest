import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AlertDialog.Builder;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__1945547392 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(ArrayAdapter.class);
      byte var2 = 1;
      Object var3 = EasyMock.createMock(OnClickListener.class);
      ((Builder)var4).setSingleChoiceItems((ListAdapter)var1, var2, (OnClickListener)var3);
   }
}
