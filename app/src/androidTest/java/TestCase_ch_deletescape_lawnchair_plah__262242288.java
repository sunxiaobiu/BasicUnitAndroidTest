import android.appwidget.AppWidgetProviderInfo;
import android.os.Parcel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__262242288 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppWidgetProviderInfo.class);
      Object var1 = EasyMock.createMock(Parcel.class);
      ((AppWidgetProviderInfo)var2).writeToParcel((Parcel)var1, 0);
   }
}
