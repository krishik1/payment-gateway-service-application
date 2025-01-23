package payment.gateway.service.appilication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void respondToEvents(@RequestBody String event) {
        System.out.println(event);
    }
    /*
    * {
  "id": "evt_1QkLN8LtfJXeRn6WbPLXqq6a",
  "object": "event",
  "api_version": "2024-12-18.acacia",
  "created": 1737619362,
  "data": {
    "object": {
      "id": "plink_1QkLN8LtfJXeRn6WyCetmKsu",
      "object": "payment_link",
      "active": true,
      "after_completion": {
        "redirect": {
          "url": "https://github.com/krishik1"
        },
        "type": "redirect"
      },
      "allow_promotion_codes": false,
      "application": null,
      "application_fee_amount": null,
      "application_fee_percent": null,
      "automatic_tax": {
        "enabled": false,
        "liability": null
      },
      "billing_address_collection": "auto",
      "consent_collection": null,
      "currency": "usd",
      "custom_fields": [

      ],
      "custom_text": {
        "after_submit": null,
        "shipping_address": null,
        "submit": null,
        "terms_of_service_acceptance": null
      },
      "customer_creation": "if_required",
      "inactive_message": null,
      "invoice_creation": {
        "enabled": false,
        "invoice_data": {
          "account_tax_ids": null,
          "custom_fields": null,
          "description": null,
          "footer": null,
          "issuer": null,
          "metadata": {
          },
          "rendering_options": null
        }
      },
      "livemode": false,
      "metadata": {
      },
      "on_behalf_of": null,
      "payment_intent_data": null,
      "payment_method_collection": "always",
      "payment_method_types": null,
      "phone_number_collection": {
        "enabled": false
      },
      "restrictions": null,
      "shipping_address_collection": null,
      "shipping_options": [

      ],
      "submit_type": "auto",
      "subscription_data": {
        "description": null,
        "invoice_settings": {
          "issuer": {
            "type": "self"
          }
        },
        "metadata": {
        },
        "trial_period_days": null,
        "trial_settings": {
          "end_behavior": {
            "missing_payment_method": "create_invoice"
          }
        }
      },
      "tax_id_collection": {
        "enabled": false,
        "required": "never"
      },
      "transfer_data": null,
      "url": "https://buy.stripe.com/test_bIY6oM3da9zGfPq28b"
    }
  },
  "livemode": false,
  "pending_webhooks": 1,
  "request": {
    "id": "req_97IkJYTjqVUOjb",
    "idempotency_key": "ebc1371c-5ecf-4168-942d-dfbe390bc3bb"
  },
  "type": "payment_link.created"
}
{
  "id": "evt_1QkLOPLtfJXeRn6WRQnBPiOP",
  "object": "event",
  "api_version": "2024-12-18.acacia",
  "created": 1737619441,
  "data": {
    "object": {
      "id": "cs_test_a1BV5Pzv7KHeePuKw85LIFh6tOKmZe7NFKAaYVjetHAllxEL8yuJ19n2lH",
      "object": "checkout.session",
      "adaptive_pricing": null,
      "after_expiration": null,
      "allow_promotion_codes": false,
      "amount_subtotal": 100,
      "amount_total": 100,
      "automatic_tax": {
        "enabled": false,
        "liability": null,
        "status": null
      },
      "billing_address_collection": "auto",
      "cancel_url": "https://stripe.com",
      "client_reference_id": null,
      "client_secret": null,
      "consent": null,
      "consent_collection": null,
      "created": 1737619398,
      "currency": "usd",
      "currency_conversion": null,
      "custom_fields": [

      ],
      "custom_text": {
        "after_submit": null,
        "shipping_address": null,
        "submit": null,
        "terms_of_service_acceptance": null
      },
      "customer": "cus_RdcdpbxabRlHu2",
      "customer_creation": "if_required",
      "customer_details": {
        "address": {
          "city": null,
          "country": "IN",
          "line1": null,
          "line2": null,
          "postal_code": null,
          "state": null
        },
        "email": "mahathokrishnamraju@gmail.com",
        "name": "Mahatho Gopala Krishnam Raju",
        "phone": null,
        "tax_exempt": "none",
        "tax_ids": [

        ]
      },
      "customer_email": null,
      "expires_at": 1737705798,
      "invoice": "in_1QkLOLLtfJXeRn6WaSk77Uc9",
      "invoice_creation": null,
      "livemode": false,
      "locale": "auto",
      "metadata": {
      },
      "mode": "subscription",
      "payment_intent": null,
      "payment_link": "plink_1QkLN8LtfJXeRn6WyCetmKsu",
      "payment_method_collection": "always",
      "payment_method_configuration_details": {
        "id": "pmc_1Qk7l4LtfJXeRn6WfdtoifUM",
        "parent": null
      },
      "payment_method_options": {
        "card": {
          "request_three_d_secure": "automatic"
        }
      },
      "payment_method_types": [
        "card",
        "link",
        "cashapp",
        "amazon_pay"
      ],
      "payment_status": "paid",
      "phone_number_collection": {
        "enabled": false
      },
      "recovered_from": null,
      "saved_payment_method_options": {
        "allow_redisplay_filters": [
          "always"
        ],
        "payment_method_remove": null,
        "payment_method_save": null
      },
      "setup_intent": null,
      "shipping_address_collection": null,
      "shipping_cost": null,
      "shipping_details": null,
      "shipping_options": [

      ],
      "status": "complete",
      "submit_type": "auto",
      "subscription": "sub_1QkLOLLtfJXeRn6Wzn72o4B7",
      "success_url": "https://github.com/krishik1",
      "total_details": {
        "amount_discount": 0,
        "amount_shipping": 0,
        "amount_tax": 0
      },
      "ui_mode": "hosted",
      "url": null
    }
  },
  "livemode": false,
  "pending_webhooks": 1,
  "request": {
    "id": null,
    "idempotency_key": null
  },
  "type": "checkout.session.completed"
}

    * */
}
