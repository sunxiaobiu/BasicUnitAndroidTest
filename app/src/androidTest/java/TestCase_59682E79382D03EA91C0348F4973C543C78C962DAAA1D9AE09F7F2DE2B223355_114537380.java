import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355_114537380 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Bundle var4 = var3.getExtras();
      Parcelable var5 = var4.getParcelable("barcode");
      Bitmap var6 = (Bitmap)var5;
      int var7 = var6.getByteCount();
   }

   public TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355_114537380() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
